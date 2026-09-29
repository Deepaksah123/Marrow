package kotlin;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class setAdsId extends MediaItemAdsConfiguration<InputStream> {
    private static final UriMatcher AudioAttributesCompatParcelizer;

    @Override // kotlin.MediaItemAdsConfiguration
    protected final /* synthetic */ void write(InputStream inputStream) throws IOException {
        read(inputStream);
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        AudioAttributesCompatParcelizer = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public setAdsId(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.MediaItemAdsConfiguration
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public InputStream read(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(uri, contentResolver);
        if (inputStreamRemoteActionCompatParcelizer != null) {
            return inputStreamRemoteActionCompatParcelizer;
        }
        throw new FileNotFoundException("InputStream is null for ".concat(String.valueOf(uri)));
    }

    private static InputStream RemoteActionCompatParcelizer(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = AudioAttributesCompatParcelizer.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return IconCompatParcelizer(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact == null) {
            throw new FileNotFoundException("Contact cannot be found");
        }
        return IconCompatParcelizer(contentResolver, uriLookupContact);
    }

    private static InputStream IconCompatParcelizer(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    private static void read(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // kotlin.fromUri
    public final Class<InputStream> write() {
        return InputStream.class;
    }
}
