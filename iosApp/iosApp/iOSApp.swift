import SwiftUI
import shared

@main
struct iOSApp: App {
    
    private let viewModel = GitUserListingViewModel(loader: GitLoader())
    
	var body: some Scene {
		WindowGroup {
            GitUserListingView()
                .environmentObject(viewModel)
		}
	}
}
