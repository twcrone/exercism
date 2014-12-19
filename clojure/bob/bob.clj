(ns bob)
(require 'clojure.string)

(defn question? [comment]
  (.endsWith comment "?"))

(defn yelling? [comment]
  (and (= (clojure.string/upper-case comment) comment)
    (not (= (clojure.string/lower-case comment) comment))))

(defn silence? [comment]
  (= (str comment) ""))

(defn response-for [initial-comment]
  (let [comment (.trim initial-comment)]
    (if (yelling? comment) (str "Whoa, chill out!")
      (if (question? comment) (str "Sure.")
        (if (silence? comment) (str "Fine. Be that way!")
          "Whatever.")))))

