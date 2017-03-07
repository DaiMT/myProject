package trash;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.proto.HFTD;
import com.proto.HFTD.data;

public class NewTableToMongo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file = new File("F:\\000\\Test\\HFTD\\dat\\SH600007\\20130107.dat");
		HFTD.data object = data.parseFrom(new FileInputStream(file));
		System.out.println(object.getVersion());
		System.out.println(object.getTradDate());
		System.out.println(object.getSerialDate());
		System.out.println(object.getTradeStatus());
//		for(boolean flag:object.getStatusArrayList()){
//			System.out.println(flag);
//		}
		int count=1;
//		for(int vol:object.getVolArrayList()){
//			System.out.println(vol+"---"+count++);
//		}
//		
		for(int i=0;i<object.getPriceArrayCount();i++){
			System.out.println(object.getTradTimeArray(i)+"---"+count+++"---"+object.getVolArray(i));
		}

	}

}
