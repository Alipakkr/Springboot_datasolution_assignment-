package com.smartdatasolutions.test.impl;

import com.smartdatasolutions.test.Member;
import com.smartdatasolutions.test.MemberExporter;
import com.smartdatasolutions.test.MemberFileConverter;
import com.smartdatasolutions.test.MemberImporter;

import java.util.List;
import java.util.Map;

public class Main extends MemberFileConverter {

	@Override
	protected MemberExporter getMemberExporter( ) {
		// TODO
		return null;
	}

	@Override
	protected MemberImporter getMemberImporter( ) {
		// TODO
		return null;
	}

	@Override
	protected List< Member > getNonDuplicateMembers( List< Member > membersFromFile ) {

		// TODO
		return null;
	}

	@Override
	protected Map< String, List< Member >> splitMembersByState( List< Member > validMembers ) {
		// TODO
		return null;
	}

	public static void main( String[] args ) {
		//TODO
	}

}
