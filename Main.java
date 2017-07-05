import Engine.*;
import ParserTree.Program;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.QueryLexer;
import parser.QueryParser;

import java.util.Scanner;

/**
 * Created by jaredwheeler on 7/3/17.
 */
public class Main {

    static public Database database = new Database();

    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            //str = reader.readLine();
            // create a CharStream that reads from standard input
            // UnbufferedCharStream input = new UnbufferedCharStream(is);
            String userInput = in.nextLine();
            ANTLRInputStream input = new ANTLRInputStream(userInput);

            // create a lexer that feeds off of input CharStream
            QueryLexer lexer = new QueryLexer(input);
            lexer.setTokenFactory(new CommonTokenFactory(true));
            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the tokens buffer
            QueryParser parser = new QueryParser(tokens);

            // begin parsing at rule 'statement' (my root rule)
            ParseTree tree = parser.program();

            tree.accept(new Program(database));
        }


    }
}
