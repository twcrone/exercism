(ns bob)

(defn question? [comment]
  (.endsWith comment "?"))

(defn exclamation? [comment]
  (.endsWith (str comment) "!"))

(defn yelling? [comment]
  (and (= (.toUpperCase comment) comment)
    (not (= (.toLowerCase comment) comment))))

(defn silence? [comment]
  (= (str comment) ""))

(defn response-for [initial-comment]
  (let [comment (.trim initial-comment)]
    (if (question? comment) (str "Sure.")
      (if (silence? comment) (str "Fine. Be that way!")
        (if (yelling? comment) (str "Whoa, chill out!")
            "Whatever.")))))

