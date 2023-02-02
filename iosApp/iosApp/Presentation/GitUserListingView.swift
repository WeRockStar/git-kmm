import SwiftUI
import shared

struct GitUserListingView: View {

    @EnvironmentObject var viewModel: GitUserListingViewModel

    var body: some View {
        NavigationView {
            List {
                ForEach(viewModel.users, id: \.id) { user in
                    GitUserView(user: user)
                }
            }.navigationTitle("KMM (SwiftUI)")
        }
    }
}
