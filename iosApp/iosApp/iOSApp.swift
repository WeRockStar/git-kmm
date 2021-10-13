import SwiftUI
import shared

@main
struct iOSApp: App {
    
    private let viewModel = GitUserViewModel(loader: GitLoader())
    
	var body: some Scene {
		WindowGroup {
            GitUserView()
                .environmentObject(viewModel)
		}
	}
}
