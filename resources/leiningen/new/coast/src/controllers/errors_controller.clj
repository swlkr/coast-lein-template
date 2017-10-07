(ns {{name}}.controllers.errors-controller
  (:require [coast.core :as coast]
            [{{name}}.views.errors :as views.errors]))

(defn not-found [request]
  (coast/not-found
    (views.errors/not-found)))
