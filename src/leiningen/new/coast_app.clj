(ns leiningen.new.coast-app
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "coast-app"))

(defn coast-app
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' coast-app project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
