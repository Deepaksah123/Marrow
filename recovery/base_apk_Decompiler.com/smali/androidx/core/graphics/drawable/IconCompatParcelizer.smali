###### Class androidx.core.graphics.drawable.IconCompatParcelizer (androidx.core.graphics.drawable.IconCompatParcelizer)
.class public Landroidx/core/graphics/drawable/IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lo/getAllPermissionGroups;)Landroidx/core/graphics/drawable/IconCompat;
    .registers 4

    .line 11
    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    invoke-direct {v0}, Landroidx/core/graphics/drawable/IconCompat;-><init>()V

    .line 12
    iget v1, v0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lo/getAllPermissionGroups;->RemoteActionCompatParcelizer(II)I

    move-result v1

    iput v1, v0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    .line 13
    iget-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->read:[B

    invoke-virtual {p0, v1}, Lo/getAllPermissionGroups;->AudioAttributesCompatParcelizer([B)[B

    move-result-object v1

    iput-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->read:[B

    .line 14
    iget-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Parcelable;

    const/4 v2, 0x3

    invoke-virtual {p0, v1, v2}, Lo/getAllPermissionGroups;->IconCompatParcelizer(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    iput-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Parcelable;

    .line 15
    iget v1, v0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v2}, Lo/getAllPermissionGroups;->RemoteActionCompatParcelizer(II)I

    move-result v1

    iput v1, v0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    .line 16
    iget v1, v0, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer:I

    const/4 v2, 0x5

    invoke-virtual {p0, v1, v2}, Lo/getAllPermissionGroups;->RemoteActionCompatParcelizer(II)I

    move-result v1

    iput v1, v0, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer:I

    .line 17
    iget-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi26Parcelizer:Landroid/content/res/ColorStateList;

    const/4 v2, 0x6

    invoke-virtual {p0, v1, v2}, Lo/getAllPermissionGroups;->IconCompatParcelizer(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/content/res/ColorStateList;

    iput-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi26Parcelizer:Landroid/content/res/ColorStateList;

    .line 18
    iget-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    const/4 v2, 0x7

    invoke-virtual {p0, v1, v2}, Lo/getAllPermissionGroups;->read(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 19
    iget-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    const/16 v2, 0x8

    invoke-virtual {p0, v1, v2}, Lo/getAllPermissionGroups;->read(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    .line 20
    invoke-virtual {v0}, Landroidx/versionedparcelable/CustomVersionedParcelable;->AudioAttributesImplBaseParcelizer()V

    return-object v0
.end method

.method public static write(Landroidx/core/graphics/drawable/IconCompat;Lo/getAllPermissionGroups;)V
    .registers 4

    .line 27
    invoke-static {}, Lo/getAllPermissionGroups;->write()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/versionedparcelable/CustomVersionedParcelable;->IconCompatParcelizer(Z)V

    const/4 v0, -0x1

    .line 28
    iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    if-eq v0, v1, :cond_12

    .line 29
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RatingCompat:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lo/getAllPermissionGroups;->IconCompatParcelizer(II)V

    .line 31
    :cond_12
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->read:[B

    if-eqz v0, :cond_1b

    .line 32
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->read:[B

    invoke-virtual {p1, v0}, Lo/getAllPermissionGroups;->read([B)V

    .line 34
    :cond_1b
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Parcelable;

    if-eqz v0, :cond_25

    .line 35
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Parcelable;

    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1}, Lo/getAllPermissionGroups;->read(Landroid/os/Parcelable;I)V

    .line 37
    :cond_25
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    if-eqz v0, :cond_2f

    .line 38
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesCompatParcelizer:I

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lo/getAllPermissionGroups;->IconCompatParcelizer(II)V

    .line 40
    :cond_2f
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer:I

    if-eqz v0, :cond_39

    .line 41
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->RemoteActionCompatParcelizer:I

    const/4 v1, 0x5

    invoke-virtual {p1, v0, v1}, Lo/getAllPermissionGroups;->IconCompatParcelizer(II)V

    .line 43
    :cond_39
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi26Parcelizer:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_43

    .line 44
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi26Parcelizer:Landroid/content/res/ColorStateList;

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Lo/getAllPermissionGroups;->read(Landroid/os/Parcelable;I)V

    .line 46
    :cond_43
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    if-eqz v0, :cond_4d

    .line 47
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    const/4 v1, 0x7

    invoke-virtual {p1, v0, v1}, Lo/getAllPermissionGroups;->IconCompatParcelizer(Ljava/lang/String;I)V

    .line 49
    :cond_4d
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    if-eqz v0, :cond_58

    .line 50
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    const/16 v0, 0x8

    invoke-virtual {p1, p0, v0}, Lo/getAllPermissionGroups;->IconCompatParcelizer(Ljava/lang/String;I)V

    :cond_58
    return-void
.end method
