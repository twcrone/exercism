(ns bob)

(defn question? [comment]
  (.endsWith comment "?"))

(defn exclamation? [comment]
  (.endsWith (str comment) "!"))

(defn silence? [comment]
  (= (str comment) ""))

(defn response-for [initial-comment]
  (let [comment (.trim initial-comment)]
    (if (question? comment) (str "Sure.")
      (if (exclamation? comment) (str "Whoa, chill out!")
        (if (silence? comment) (str "Fine. Be that way!")
        "Whatever.")))))

