# :: Estimation-of-the-number-Pi-using-Monte-Carlo ::
## Description:
**Monte Carlo methods are a broad class of computational algorithms that rely on repeated random sampling to obtain numerical results. One of the basic examples of getting started with the Monte Carlo algorithm is the estimation of Pi.
We are able to approximate in on the mathematical constant Pi using Monte Carlo simulation, which is a multi-random experiment-based method.**

![powers-of-ten](https://user-images.githubusercontent.com/73428356/193857396-d1422f26-9922-40f0-9299-fc4d51212fbd.jpg)
## The algorithms work:
1. Initialize points in circle and outside to 0, pi include default value and the epsilon is equal 0.00001,
2. Calculated Pi is declared as  `π = 4 * ((points in the circle) : ( points in the circle + points outside the circle))` even though the simulation was only I multiplied the result by 4, 
3. The function randomly generates two points y and x,
4. If was calculated `(x^2 + y^2) <= 1` , insert points inside the circle, otherwise points will be outside the circle,
5. The error cannot be more than one hundred million, and if one is greater than 0, end the loop.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
_**My application was built in Java with using SpringBoot. You can see a view of the application by localhost:8080 with extra "gets" properties. I've saved it in Docker as well so I don't have to run a Java virtual machine although I inserted my app here I inserted my application here to show the syntax from the program**_

## Docker 
![doc_1](https://user-images.githubusercontent.com/73428356/193866260-f7cbb0d4-50aa-4d55-ab87-53e0991936a7.jpg)
![doc_2](https://user-images.githubusercontent.com/73428356/193866274-e41a6943-c64a-4f8d-9bcf-0ae66162a035.jpg)
