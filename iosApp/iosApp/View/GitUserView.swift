//
//  GitUserView.swift
//  iosApp
//
//  Created by Kotchaphan Muangsan on 13/10/2564 BE.
//  Copyright © 2564 BE WeRockStar. All rights reserved.
//

import SwiftUI
import shared

struct GitUserView: View {
    let user: GithubUser

    var body: some View {
        HStack {
            UserImageView(imageUrl: user.avatarUrl.orEmpty())
            VStack {
                Text(user.username)
                if user.name?.isEmpty == false {
                    Spacer()
                    Text(user.name.orEmpty())
                }
            }
        }
    }
}
