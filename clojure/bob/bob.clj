(ns bob)

(defn question? [comment]
  (.endsWith comment "?"))

(defn exclamation? [comment]
  (.endsWith (str comment) "!"))

(defn yelling? [comment]
  (= (.toUpperCase comment) comment))

(defn silence? [comment]
  (= (str comment) ""))

(defn response-for [initial-comment]
  (let [comment (.trim initial-comment)]
    (if (silence? comment) (str "Fine. Be that way!")
      (if (yelling? comment) (str "Whoa, chill out!")
        (if (question? comment) (str "Sure.")
            "Whatever.")))))

