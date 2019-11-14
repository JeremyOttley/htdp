(ns htdp.ch1)

(defn distance-of-point 
  "Ex. 11: Define a function that consumes two numbers, x and y, 
   and that computes the distance of point (x,y) to the origin."
  [x y] 
  (Math/sqrt (+ (* x x) (* y y))))

(defn string-first
  "Ex. 13: Define the function string-first, 
  which extracts the first 1String from a non-empty string."
  [string]
  (first (clojure.string/split string #"")))
