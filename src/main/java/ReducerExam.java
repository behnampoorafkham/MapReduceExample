import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.ArrayList;

public class ReducerExam extends Reducer<Text , IntWritable, Text , IntWritable> {

    public ReducerExam(Text key , ArrayList<Integer> value , Context context) throws IOException, InterruptedException {
        int sum = 0;
        for (int item :value) {
            sum += item;
        }
        context.write(key , new IntWritable(sum));
    }
}
