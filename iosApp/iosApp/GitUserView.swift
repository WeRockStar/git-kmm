import SwiftUI
import shared

struct GitUserView: View {
    @EnvironmentObject var viewModel: GitUserViewModel
    
    var body: some View {
        NavigationView {
            List {
                ForEach(viewModel.users, id: \.username) { user in
                    Text(user.username)
                }
            }.navigationTitle("KMM (SwiftUI)")
        }
    }
}

struct GitUserView_Previews: PreviewProvider {
    static var previews: some View {
        GitUserView()
    }
}
