(ns {{name}}.routes
  (:require [coast.core :as coast]
            [{{name}}.controllers.home-controller :as home]
            [{{name}}.controllers.errors-controller :as errors]))

(def routes
  (-> (coast/get "/" home/index)
      (coast/route-not-found errors/not-found)))
