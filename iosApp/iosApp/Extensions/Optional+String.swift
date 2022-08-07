//
//  Optional+String.swift
//  iosApp
//
//  Created by Kotchaphan Muangsan on 13/10/2564 BE.
//  Copyright © 2564 BE WeRockStar. All rights reserved.
//

import Foundation

extension Optional where Wrapped == String {
    func orEmpty() -> String {
        switch self {
        case .none:
            return ""
        case .some(let value):
            return value
        }
    }
}
