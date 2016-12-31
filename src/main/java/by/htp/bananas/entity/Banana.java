package by.htp.bananas.entity;

/**
 * Created by Ark on 27.12.2016.
 */
public class Banana implements  Comparable<Banana> {
    private int size;
    private String taste;

    public Banana(int size, String taste) {
        this.size = size;
        this.taste = taste;
    }

    public int compareTo(Banana banana) {
        int result;
        switch(taste) {
            case "best":
                switch (banana.taste) {
                case "best":    result = 0;     break;
                case "good":
                case "normal":
                case "bad":
                case "awful":   result = 1; break;
                default:
                    result = -1; break;
                }
                break;
            case "good":
                switch (banana.taste) {
                case "best":   result = -1; break;
                case "good":   result = 0;  break;
                case "normal":
                case "bad":
                case "awful":  result = 1;  break;
                default:
                    result = -1; break;
                }
                break;
            case "normal":
                switch (banana.taste) {
                case "best":
                case "good":   result = -1; break;
                case "normal": result = 0;  break;
                case "bad":
                case "awful":  result = 1;  break;
                default:
                    result = -1; break;
                }
                break;
            case "bad":
                switch (banana.taste) {
                case "best":
                case "good":
                case "normal": result = -1; break;
                case "bad":    result = 0;  break;
                case "awful":  result = 1;  break;
                default:
                    result = -1; break;
                }
                break;
            case "awful":
                switch (banana.taste) {
                case "best":
                case "good":
                case "normal":
                case "bad":    result = -1; break;
                case "awful":  result = 0;  break;
                default:
                    result = -1; break;
                }
                break;
            default:
                result = -1;
                break;
        }

        if(0 == result) {
            if (size > banana.size)
                return 1;
            if (size < banana.size)
                return -1;
            return 0;
        }
        return result;
    }


    @Override
    public String toString() {
        return "by.htp.bananas.entity.Banana{" +
                "size=" + size +
                ", taste='" + taste + '\'' +
                '}';
    }
}
