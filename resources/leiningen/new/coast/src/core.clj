(ns {{name}}.core
  (:require [coast.core :as coast]
            [{{name}}.routes :as routes])
  (:gen-class))

(def app
  (-> routes/routes
      (coast/wrap-defaults coast/site-defaults)
      (coast/wrap-resource "public")
      (coast/wrap-with-logger)))

(coast/set-app! app)

(defn -main [& [port]]
  (let [port (-> (or port (coast/env :port))
                 (coast/parse-int))]
    (coast/run-server app {:port port})
    (println (str "Server is listening at http://localhost:" port))))
