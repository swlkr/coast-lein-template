(ns leiningen.new.coast
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "coast"))

(defn get-random-str [length]
  (let [alphanumeric "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"]
    (apply str (repeatedly length #(rand-nth alphanumeric)))))

(defn coast [name]
  (let [data {:name name
              :sanitized (name-to-path name)
              :test-secret (get-random-str 16)
              :dev-secret (get-random-str 16)}]
    (main/info "Generating fresh 'lein new' coast project.")
    (->files data
      ; root
      [".gitignore" (render ".gitignore" data)]
      ["Procfile" (render "Procfile" data)]
      ["profiles.clj" (render "profiles.clj" data)]
      ["project.clj" (render "project.clj" data)]
      ["README.md" (render "README.md" data)]

      ; src
      ["src/{{sanitized}}/core.clj" (render "src/core.clj" data)]
      ["src/{{sanitized}}/routes.clj" (render "src/routes.clj" data)]
      ["src/{{sanitized}}/components.clj" (render "src/components.clj" data)]

      ; src/views
      ["src/{{sanitized}}/views/home.clj" (render "src/views/home.clj" data)]
      ["src/{{sanitized}}/views/errors.clj" (render "src/views/errors.clj" data)]

      ; src/controllers
      ["src/{{sanitized}}/controllers/home_controller.clj" (render "src/controllers/home_controller.clj" data)]
      ["src/{{sanitized}}/controllers/errors_controller.clj" (render "src/controllers/errors_controller.clj" data)]

      ; test folder
      ["test/{{sanitized}}/core_test.clj" (render "test/core_test.clj" data)]

      ; resources folder
      ["resources/public/css/app.css" (render "resources/public/css/app.css" data)]
      ["resources/public/js/app.js" (render "resources/public/js/app.js" data)])))
