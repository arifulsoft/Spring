import { Component, OnInit } from '@angular/core';
import { Post } from '../models/post';
import { PostService } from '../service/post.service';

@Component({
  selector: 'app-showpost',
  templateUrl: './showpost.component.html',
  styleUrls: ['./showpost.component.css']
})
export class ShowpostComponent implements OnInit {

  // constructor(private myservice:PostService) {
  //   //this.allpost=this.myservice.getallpost();
  //   this.myservice.getallposts().subscribe((response)=>{this.allpost=response});

  //  }

  ngOnInit(): void {
  }
  // allpost:any=[];
  
  allStudent:any=[];
  constructor(private myservice:PostService) {
    //this.allpost=this.myservice.getallpost();
    this.myservice.getallStudent().subscribe((response)=>{this.allStudent=response});

}
}