public class SurveyResults {
    public static void main(String [] args){

        boolean[][] survey = {{true, true, true, true },
                  {false, false, false, false, }, 
                  {false, false, false, false, },
                  {false, false, false, false, }};


                  System.out.println(survey.length);

                  System.out.println(survey[0].length);

                  System.out.println(survey[1][0]);
                  survey[1][0] = true;
                  System.out.println(survey[1][0]);
    }
                }

