import java.util.*;
public class NumericQuestion extends Question
{
    private double answer;
    // An example of overloading (the setAnswer method that takes a String is being overloaded)
    public void setAnswer(double correctResponse)
    {
        this.answer = correctResponse;
    }
    // overriding (the checkAnswer method in the question class is being overridden)
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        return Math.abs(responseAsDouble - answer) <= 0.01;
    }
}
