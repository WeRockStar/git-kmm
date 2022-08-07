//
//  GitUserViewModel.swift
//  iosApp
//
//  Created by Kotchaphan Muangsan on 13/10/2564 BE.
//  Copyright © 2564 BE WeRockStar. All rights reserved.
//

import shared
import Combine

final class GitUserListingViewModel: ObservableObject {
    
    private let loader: GitLoader
    
    @Published var users: [GitUser] = []
    
    init(loader: GitLoader) {
        self.loader = loader
        fetchUsers()
    }
    
    func fetchUsers() {
        loader.fetchUsers(completionHandler: { users, error in
            guard let users = users else { return }
            self.users = users
        })
    }
}
