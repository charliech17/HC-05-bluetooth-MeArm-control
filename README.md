#藍芽機械手臂控制app
---
  　手機app的藍芽當作client端，HC-05藍芽模組當作Server端,兩者進行連結(HC-05硬體上還會再接到arduino uno板)。連結後可以用app控制機械手臂。<br />

　　位於arduino資料夾中的檔案:Me_Arm_Control為arduino控制的程式。當它收到app傳送特定的字母時會轉動Servo一度，來控制Servo馬達。<br />

　　app的寫法則是:當使用者按下某個按鈕，那個按鈕會每0.125秒傳送一個字每給HC-05，因此可以達到"按著按鈕不放，手臂就會持續移動"的效果。<br />


   　以下網址是用Me_ARM搭配這支手機app夾娃娃的測試影片:[https://www.youtube.com/watch?v=a36TSj4wXyg](https://www.youtube.com/watch?v=a36TSj4wXyg)

   