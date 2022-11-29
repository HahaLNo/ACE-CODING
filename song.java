public class Song
{

    public void verse(){
        System.out.print("애써서 활짝 웃었던 날에 밤은 왜 더 어두울까 It keeps bringing me down down down Hmm 모두 너무 쉽게 내뱉던 말 아마 들리겠지 머지않아 I've heard enough, I've heard enough Of the things that I'm not 온 세상이 바뀌어가도 아직 나는 그대론 걸 내가 걸어가는 이 길을 꿈꾸던 그때 그대로 그때 그대로 내 매일을 춤추던 처음 그 자리에 남아 있는 걸");
    }

    public Song(String initVerse){
        verse = initVerse;
    }

   public static void main(String args[])
   {

    Song cashier = new Song("But you'll never know unless you walk in my shoes You'll never know 엉켜버린 내 끈 'Cause everybody sees what they wanna see It's easier to judge me than to believe 깊이 숨겼던 낡은 생각들 가끔 나를 잡고 괴롭히지만 그럴수록 I'ma shine baby You know they ain't got a shot on me");

    public void setVerse(initVerse){
        return verse;
    }

  

       // Create a Song object and call its method(s) to print out
       // the verses of the song you chose
       // There should be at least 1 method called verse that takes arguments


  }
}
