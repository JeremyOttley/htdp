(ns htdp.ch1)

(defn distance-of-point 
  "Ex. 11: Define a function that consumes two numbers, x and y, 
   and that computes the distance of point (x,y) to the origin."
  [x y] 
  (Math/sqrt (+ (* x x) (* y y))))

(defn cvolume
  "Ex. 12: Define the function cvolume, which accepts the length of a side of an equilateral cube 
  and computes its volume."
  [length]
  (* length length length))

(defn csurface
  "Ex. 12: If you have time, consider defining csurface, too."
  [length]
  (* (* length length) 6))

(defn string-first
  "Ex. 13: Define the function string-first, 
  which extracts the first 1String from a non-empty string."
  [string]
  (first (clojure.string/split string #"")))

(defn string-last
  "Ex. 14: Define the function string-last, which extracts the last 1String from a non-empty string."
  [string]
  (last (clojure.string/split string #"")))
