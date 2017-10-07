(ns {{name}}.views.errors
  (:require [{{name}}.components :as c]))

(defn not-found []
  (c/layout
    "Not found"))
