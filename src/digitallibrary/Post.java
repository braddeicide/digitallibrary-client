/*
 * Post.java
 *
 * Created on August 31, 2005, 1:16 AM
 */

package digitallibrary;
import java.awt.*;
import java.net.*;
import java.io.*;

/**
 *
 * @author brad
 */
public class Post {
    
    /** Creates a new instance of Post */
    public Post(String uploadFile, String URLtarget, String storageDir, String username, String password) {

    System.out.println("MD5 is " + uploadFile);
    
    		try{
// TODO: multipart is seporated with ****4353 (hard coded, cahnge this to a dynamic string
// run this as an application first, when it works than make an applet of it
			URL u = new URL(URLtarget + "upload.php?username=" + username + "&password=" + password);
			URLConnection c = u.openConnection();
			// post multipart data
			c.setDoOutput(true);
			c.setDoInput(true);
			c.setUseCaches(false);
			// set some request headers
			c.setRequestProperty("Connection", "Keep-Alive");
// TODO: get codebase of the this (the applet) to use for referer
			c.setRequestProperty("HTTP_REFERER", "http://applet.getcodebase");
			c.setRequestProperty("Content-Type", "multipart/form-data; boundary=****4353");
			DataOutputStream dstream = new DataOutputStream(c.getOutputStream());
// write content to the server, begin with the tag that says a content element is comming
			dstream.writeBytes("--****4353\r\n");
// discribe the content, (in this case it's a file)
// TODO: the file should be the file name provided by the dileDialog
			dstream.writeBytes("Content-Disposition: form-data; name=\"file\"; filename=\""+uploadFile+"\"\r\nContent-Type: application/octet-stream\r\n\r\n");
// open a file
//			String title = "Frame Title";
//			Frame frame = new Frame("Select a file");
//			FileDialog fd = new FileDialog(frame);
//			frame.setSize(400, 400);
//			fd.show();
//			System.out.println(fd.getDirectory() + fd.getFile());
			File f = new File(storageDir + "\\" + uploadFile);
			FileInputStream fi = new FileInputStream(f);
// keep reading 1000 bytes from the file
			byte[] bt = new byte[1000];
			int cnt = fi.read(bt);
			while(cnt==bt.length){
				dstream.write(bt,0,cnt);
				cnt = fi.read(bt);
			}
// send the last bit to the server
			dstream.write(bt,0,cnt);
// now close the file and let the web server know this is the end of this form part
			dstream.writeBytes("\r\n--****4353\r\n");
// send a form part named TargetURL with the value: /IntranetContent/TelephoneGuide/Upload/
			dstream.writeBytes("Content-Disposition: form-data; name=\"initial\"\r\n\r\n");
			dstream.writeBytes("false");
// let the web server know this is the end of this form part
			dstream.writeBytes("\r\n--****4353\r\n");
// send a form part named redirectURL with the value: http://none/none
			dstream.writeBytes("Content-Disposition: form-data; name=\"redirectURL\"\r\n\r\n");
			dstream.writeBytes("http://none/none");
// this is the last information part of the multi part request, close the request
// close the multipart form request
			dstream.writeBytes("\r\n--****4353--\r\n\r\n");
			dstream.flush();
			dstream.close();
			fi.close();
			try{
				DataInputStream in =
					new DataInputStream(
						new BufferedInputStream(c.getInputStream()));
				String sIn = in.readLine();
				boolean b = true;
// TODO: this will loop forever unless you make sure your server page
// sends a last line like "I am done"
// than you can do wile(sIn.compareTo("I am done")!=0){
				while(sIn!=null){
					if(sIn!=null){
						System.out.println(sIn);
					}
					sIn = in.readLine();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
