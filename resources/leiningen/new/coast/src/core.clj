(ns {{name}}.core
  (:require [coast.core :as coast]
            [{{name}}.routes :as routes]
            [{{name}}.components :as c])
  (:gen-class))

(def app
  (-> routes/routes
      (coast/wrap-coast-defaults {:layout c/layout})))

(defn coast []
  (coast/start-server app)

  (defn -main [& [port]]
    (coast/start-server app {:port port})))
