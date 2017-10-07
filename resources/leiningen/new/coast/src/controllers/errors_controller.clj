(ns {{name}}.controllers.errors-controller
  (:require [{{name}}.views.errors :as views.errors]))

(defn not-found [request]
  (views.errors/not-found))
