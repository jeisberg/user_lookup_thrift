namespace java com.lockerz.thrift.user_lookup.gen

struct UserLookup {
	1:i64 id,
	2:i64 podId,
	3:string email,
	4:string normalizedEmail,
	5:string created,
	6:string modified
}

exception UserLookupServiceException {
	1:string message
	2:map<double,string> errors
}
	 
service UserLookupService {
	UserLookup lookupById(1:string token, 2:i64 id) throws (1:UserLookupServiceException e)
	UserLookup lookupByUsername(1:string token, 2:string username) throws (1:UserLookupServiceException e)
}
