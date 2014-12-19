(ns bob)

(defn question? [comment]
  (.endsWith comment "?"))

(defn exclamation? [comment]
  (.endsWith (str comment) "!"))

(defn response-for [comment]
  (if (question? comment)
    (str "Sure.")
    (if (exclamation? comment) (str "Whoa, chill out!")
      "Whatever.")))

