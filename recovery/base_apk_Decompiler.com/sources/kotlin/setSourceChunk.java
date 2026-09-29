package kotlin;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class setSourceChunk implements getApplicationLabel {
    public final EditText AudioAttributesCompatParcelizer;
    public final EditText AudioAttributesImplApi21Parcelizer;
    public final EditText AudioAttributesImplApi26Parcelizer;
    public final EditText AudioAttributesImplBaseParcelizer;
    public final EditText IconCompatParcelizer;
    public final EditText MediaBrowserCompatCustomActionResultReceiver;
    public final TextInputLayout MediaBrowserCompatItemReceiver;
    public final TextInputLayout MediaBrowserCompatMediaItem;
    public final TextInputLayout MediaBrowserCompatSearchResultReceiver;
    private TextInputLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextInputLayout MediaDescriptionCompat;
    public final TextInputLayout MediaMetadataCompat;
    private final LinearLayout RatingCompat;
    public final EditText RemoteActionCompatParcelizer;
    private TextInputLayout handleMediaPlayPauseIfPendingOnHandler;
    private TextInputLayout onAddQueueItem;
    private TextInputLayout onCommand;
    public final EditText read;
    public final AutoCompleteTextView write;

    private setSourceChunk(LinearLayout linearLayout, AutoCompleteTextView autoCompleteTextView, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8, TextInputLayout textInputLayout9) {
        this.RatingCompat = linearLayout;
        this.write = autoCompleteTextView;
        this.AudioAttributesCompatParcelizer = editText;
        this.RemoteActionCompatParcelizer = editText2;
        this.read = editText3;
        this.IconCompatParcelizer = editText4;
        this.AudioAttributesImplBaseParcelizer = editText5;
        this.AudioAttributesImplApi21Parcelizer = editText6;
        this.MediaBrowserCompatCustomActionResultReceiver = editText7;
        this.AudioAttributesImplApi26Parcelizer = editText8;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textInputLayout;
        this.onAddQueueItem = textInputLayout2;
        this.handleMediaPlayPauseIfPendingOnHandler = textInputLayout3;
        this.MediaBrowserCompatItemReceiver = textInputLayout4;
        this.MediaBrowserCompatSearchResultReceiver = textInputLayout5;
        this.MediaBrowserCompatMediaItem = textInputLayout6;
        this.MediaMetadataCompat = textInputLayout7;
        this.MediaDescriptionCompat = textInputLayout8;
        this.onCommand = textInputLayout9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public static setSourceChunk IconCompatParcelizer(View view) {
        int i = R.id.actState;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.actState);
        if (autoCompleteTextView != null) {
            i = R.id.etAddressLine1;
            EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etAddressLine1);
            if (editText != null) {
                i = R.id.etAddressLine2;
                EditText editText2 = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etAddressLine2);
                if (editText2 != null) {
                    i = R.id.etAddressLine3;
                    EditText editText3 = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etAddressLine3);
                    if (editText3 != null) {
                        i = R.id.etAlternatePhone;
                        EditText editText4 = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etAlternatePhone);
                        if (editText4 != null) {
                            i = R.id.etCity;
                            EditText editText5 = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etCity);
                            if (editText5 != null) {
                                i = R.id.etName;
                                EditText editText6 = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etName);
                                if (editText6 != null) {
                                    i = R.id.etPhone;
                                    EditText editText7 = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etPhone);
                                    if (editText7 != null) {
                                        i = R.id.etPinCode;
                                        EditText editText8 = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etPinCode);
                                        if (editText8 != null) {
                                            i = R.id.tilAddressLine1;
                                            TextInputLayout textInputLayout = (TextInputLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tilAddressLine1);
                                            if (textInputLayout != null) {
                                                i = R.id.tilAddressLine2;
                                                TextInputLayout textInputLayout2 = (TextInputLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tilAddressLine2);
                                                if (textInputLayout2 != null) {
                                                    i = R.id.tilAddressLine3;
                                                    TextInputLayout textInputLayout3 = (TextInputLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tilAddressLine3);
                                                    if (textInputLayout3 != null) {
                                                        i = R.id.tilAlternatePhone;
                                                        TextInputLayout textInputLayout4 = (TextInputLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tilAlternatePhone);
                                                        if (textInputLayout4 != null) {
                                                            i = R.id.tilCity;
                                                            TextInputLayout textInputLayout5 = (TextInputLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tilCity);
                                                            if (textInputLayout5 != null) {
                                                                i = R.id.tilName;
                                                                TextInputLayout textInputLayout6 = (TextInputLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tilName);
                                                                if (textInputLayout6 != null) {
                                                                    i = R.id.tilPhone;
                                                                    TextInputLayout textInputLayout7 = (TextInputLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tilPhone);
                                                                    if (textInputLayout7 != null) {
                                                                        i = R.id.tilPinCode;
                                                                        TextInputLayout textInputLayout8 = (TextInputLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tilPinCode);
                                                                        if (textInputLayout8 != null) {
                                                                            i = R.id.tilState;
                                                                            TextInputLayout textInputLayout9 = (TextInputLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tilState);
                                                                            if (textInputLayout9 != null) {
                                                                                return new setSourceChunk((LinearLayout) view, autoCompleteTextView, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8, textInputLayout9);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
