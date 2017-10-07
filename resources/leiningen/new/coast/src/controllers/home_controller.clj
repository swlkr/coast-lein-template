(ns {{name}}.controllers.home-controller
  (:require [{{name}}.views.home :as views.home]))

(defn index [request]
  (views.home/index))
