//
//  UserImageView.swift
//  iosApp
//
//  Created by Kotchaphan Muangsan on 13/10/2564 BE.
//  Copyright © 2564 BE WeRockStar. All rights reserved.
//

import SwiftUI

struct UserImageView: View {
    let imageUrl: String
    
    var body: some View {
        AsyncImage(url: URL(string: imageUrl)) { image in
            image.resizable()
        } placeholder: {
            PlaceholderImageView()
        }
        .frame(width: 60, height: 60, alignment: .leading)
        .clipShape(Circle())
    }
}
