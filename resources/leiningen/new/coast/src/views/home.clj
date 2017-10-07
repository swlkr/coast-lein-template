(ns {{name}}.views.home
  (:require [{{name}}.components :as c]))

(defn index []
  (c/layout
    "You're coasting on clojure!"))
