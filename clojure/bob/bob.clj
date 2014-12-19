(ns bob)
(require 'clojure.string)

(defn question? [comment]
  (= (last comment) \?))

(defn yelling? [comment]
  (and (= (clojure.string/upper-case comment) comment)
    (not (= (clojure.string/lower-case comment) comment))))

(defn silence? [comment]
  (= comment ""))

(defn response-for [initial-comment]
  (let [comment (clojure.string/trim initial-comment)]
    (if (yelling? comment) "Whoa, chill out!"
      (if (question? comment) "Sure."
        (if (silence? comment) "Fine. Be that way!"
          "Whatever.")))))

