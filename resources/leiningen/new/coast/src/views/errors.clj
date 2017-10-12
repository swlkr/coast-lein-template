(ns {{name}}.views.errors
  (:require [{{name}}.components :as c]
            [coast.core :as coast]))

(defn not-found []
  (coast/not-found "Not found"))
