package com.smartdatasolutions.test.impl;

import com.smartdatasolutions.test.Member;
import com.smartdatasolutions.test.MemberImporter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class MemberImporterImpl implements MemberImporter {

	@Override
	public List< Member > importMembers( File inputFile ) throws Exception {

		/*
		 * Implement the missing logic
		 */

		try (BufferedReader br = new BufferedReader( new FileReader( inputFile ) )) {
			String line = br.readLine( );

			while ( line != null ) {
				line = br.readLine( );

			}
		}

		return null;
	}
	
	

}
