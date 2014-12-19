(ns bob)

(defn question? [comment]
  (.endsWith comment "?"))

(defn response-for [comment]
  (if (question? comment)
    ("Sure.")
    "Whatever."))

