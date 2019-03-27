package com.person.bootstater.services.compress;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;
 
public class ProtectedCompressFile
{
	
    private static final String PASS = "threeidiots27";
	private static final String ZIP_FILE = "/tech.zip";
    private static final String UNZIP_PATH = "/bak";


	public static void main(String[] args){
//    	zipIt();
    	unZipEncrypted();
    }
    
    public static void zipIt() {
    	
    	 try {
             //This is name and path of zip file to be created
             net.lingala.zip4j.core.ZipFile zipFile = new net.lingala.zip4j.core.ZipFile(ZIP_FILE);
              
             //Add files to be archived into zip file
             ArrayList<File> filesToAdd = new ArrayList<File>();
             filesToAdd.add(new File("/culprateseverywhere/bk.html")); //zip file content
              
             ZipParameters parameters = zipParameters();
              
             //Now add files to the zip file
             zipFile.addFiles(filesToAdd, parameters);
         }
         catch (ZipException e)
         {
             e.printStackTrace();
         }
    }

	private static ZipParameters zipParameters() {
		//Initiate Zip Parameters which define various properties
		 ZipParameters parameters = new ZipParameters();
		 parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE); // set compression method to deflate compression
		  
		 //DEFLATE_LEVEL_FASTEST     - Lowest compression level but higher speed of compression
		 //DEFLATE_LEVEL_FAST        - Low compression level but higher speed of compression
		 //DEFLATE_LEVEL_NORMAL  - Optimal balance between compression level/speed
		 //DEFLATE_LEVEL_MAXIMUM     - High compression level with a compromise of speed
		 //DEFLATE_LEVEL_ULTRA       - Highest compression level but low speed
		 parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
		  
		 //Set the encryption flag to true
		 parameters.setEncryptFiles(true);
		  
		 //Set the encryption method to AES Zip Encryption
		 parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
		  
		 //AES_STRENGTH_128 - For both encryption and decryption
		 //AES_STRENGTH_192 - For decryption only
		 //AES_STRENGTH_256 - For both encryption and decryption
		 //Key strength 192 cannot be used for encryption. But if a zip file already has a
		 //file encrypted with key strength of 192, then Zip4j can decrypt this file
		 parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
		  
		 //Set password
		 parameters.setPassword(PASS);
		return parameters;
	}
    
    public static void unZipEncrypted() {
    	
    	try {
			net.lingala.zip4j.core.ZipFile zipFile = new net.lingala.zip4j.core.ZipFile(ZIP_FILE);
			
			if(zipFile.isEncrypted()) {
				zipFile.setPassword(PASS);
			}
//			UnzipParameters unzipParameters = new UnzipParameters();
			
			
		//	unzipParameters.
			
		//	zipFile.extractAll(UNZIP_PATH, null);
			
			@SuppressWarnings("unchecked")
            List<FileHeader> fileHeaders = zipFile.getFileHeaders();

            for(FileHeader fileHeader : fileHeaders) {
                if (fileHeader.isDirectory()) {
                    zipFile.extractFile(fileHeader, UNZIP_PATH);
                }else {
                	zipFile.extractAll(UNZIP_PATH);
                }
            }
    	
    	} catch (ZipException e) {
			e.printStackTrace();
		}
    	    	
    }
    
}