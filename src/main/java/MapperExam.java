import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

public class MapperExam extends Mapper<LongWritable , Text , Text, IntWritable> {
    private Text word = new Text();
    public MapperExam(LongWritable key, Text value , Context context) throws IOException, InterruptedException {
        String line = value.toString();
        StringTokenizer st = new StringTokenizer(line," ");
        while(st.hasMoreTokens()){
            word.set(st.nextToken());
            context.write(value , new IntWritable(1));
        }
        System.out.println("////");
        System.out.println("////");
        System.out.println("////");
        System.out.println("////");
        System.out.println("////");
        System.out.println("////");
        System.out.println("////");
    }
}
