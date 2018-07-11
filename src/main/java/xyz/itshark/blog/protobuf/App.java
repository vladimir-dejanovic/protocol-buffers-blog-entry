package xyz.itshark.blog.protobuf;


/*
    Code used as show case for my blog post Protocol Buffers basic stuff you need to know
    Copyright (C) 2018  Vladimir Dejanović

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

import xyz.itshark.blog.protobuf.generated.Advanced;
import xyz.itshark.blog.protobuf.generated.Example;
import xyz.itshark.blog.protobuf.generated.Status;


public class App 
{
    public static void main( String[] args )
    {
        Example example = Example.newBuilder()
                .setId(1)
                .setFirstName("First")
                .setLastName("Last")
                .build();

        Advanced advanced = Advanced.newBuilder()
                .setMyStatus(Status.RANDOM)
                .addText("some text")
                .addText("other text")
                .setMessageExample(example)
                .build();

        System.out.println(advanced);
    }
}
