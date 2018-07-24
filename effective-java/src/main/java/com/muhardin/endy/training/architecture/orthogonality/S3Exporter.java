package com.muhardin.endy.training.architecture.orthogonality;

public class S3Exporter implements DataExporter {
    private String s3url;
    private String awsClientId;
    private String awsClientKey;

    public S3Exporter(String url, String username, String password){
        this.s3url = url;
        this.awsClientId = username;
        this.awsClientKey = password;
    }

	public void export(String data) {
		// upload ke s3url
	}
}