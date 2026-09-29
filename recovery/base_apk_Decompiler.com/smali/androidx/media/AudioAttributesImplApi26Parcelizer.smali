###### Class androidx.media.AudioAttributesImplApi26Parcelizer (androidx.media.AudioAttributesImplApi26Parcelizer)
.class public Landroidx/media/AudioAttributesImplApi26Parcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lo/getAllPermissionGroups;)Landroidx/media/AudioAttributesImplApi26;
    .registers 4

    .line 11
    new-instance v0, Landroidx/media/AudioAttributesImplApi26;

    invoke-direct {v0}, Landroidx/media/AudioAttributesImplApi26;-><init>()V

    .line 12
    iget-object v1, v0, Landroidx/media/AudioAttributesImplApi21;->RemoteActionCompatParcelizer:Landroid/media/AudioAttributes;

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lo/getAllPermissionGroups;->IconCompatParcelizer(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/media/AudioAttributes;

    iput-object v1, v0, Landroidx/media/AudioAttributesImplApi21;->RemoteActionCompatParcelizer:Landroid/media/AudioAttributes;

    .line 13
    iget v1, v0, Landroidx/media/AudioAttributesImplApi21;->AudioAttributesCompatParcelizer:I

    const/4 v2, 0x2

    invoke-virtual {p0, v1, v2}, Lo/getAllPermissionGroups;->RemoteActionCompatParcelizer(II)I

    move-result p0

    iput p0, v0, Landroidx/media/AudioAttributesImplApi21;->AudioAttributesCompatParcelizer:I

    return-object v0
.end method

.method public static write(Landroidx/media/AudioAttributesImplApi26;Lo/getAllPermissionGroups;)V
    .registers 4

    .line 20
    iget-object v0, p0, Landroidx/media/AudioAttributesImplApi21;->RemoteActionCompatParcelizer:Landroid/media/AudioAttributes;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lo/getAllPermissionGroups;->read(Landroid/os/Parcelable;I)V

    .line 21
    iget p0, p0, Landroidx/media/AudioAttributesImplApi21;->AudioAttributesCompatParcelizer:I

    const/4 v0, 0x2

    invoke-virtual {p1, p0, v0}, Lo/getAllPermissionGroups;->IconCompatParcelizer(II)V

    return-void
.end method
