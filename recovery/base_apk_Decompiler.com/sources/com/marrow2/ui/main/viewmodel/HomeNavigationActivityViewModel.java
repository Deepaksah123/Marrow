package com.marrow2.ui.main.viewmodel;

import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.setSdkPayload;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0007\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\u0007\u0010\n"}, d2 = {"Lcom/marrow2/ui/main/viewmodel/HomeNavigationActivityViewModel;", "Lo/POJOPropertyBuilderWithMember;", "<init>", "()V", "", "write", "I", "AudioAttributesCompatParcelizer", "()I", "RemoteActionCompatParcelizer", "(I)V", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeNavigationActivityViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    @setSdkPayload
    public HomeNavigationActivityViewModel() {
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.IconCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
