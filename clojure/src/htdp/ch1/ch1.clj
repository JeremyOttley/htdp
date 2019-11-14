(ns htdp.ch1)

(defn distance-of-point 
  "Ex. 11: Define a function that consumes two numbers, x and y, 
   and that computes the distance of point (x,y) to the origin."
  [x y] 
  (Math/sqrt (+ (* x x) (* y y))))


