(ns {{name}}.controllers.home-controller
  (:require [coast.core :as coast]
            [{{name}}.views.home :as views.home]))

(defn index [request]
  (coast/ok
    (views.home/index)))
