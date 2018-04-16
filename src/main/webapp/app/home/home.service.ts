import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class JHomeService {

    separator: string;
    constructor(private http: HttpClient) {
        this.separator = '.';
    }
    getUserInformation(): Observable<any> {
        return this.http.get('http://localhost:8080/api/verify?flag=true');
    }
    updateVerification(id:any): Observable<any> {
    	console.log('Coming inside verification Method After Verification');
        return this.http.put('http://localhost:8080/api/user/validate?Id='+id,{ observe: 'response' }); 
    }
   
}
