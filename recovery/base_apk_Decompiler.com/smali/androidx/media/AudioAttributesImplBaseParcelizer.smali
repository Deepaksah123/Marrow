###### Class androidx.media.AudioAttributesImplBaseParcelizer (androidx.media.AudioAttributesImplBaseParcelizer)
.class public Landroidx/media/AudioAttributesImplBaseParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lo/getAllPermissionGroups;)Landroidx/media/AudioAttributesImplBase;
    .registers 4

    .line 11
    new-instance v0, Landroidx/media/AudioAttributesImplBase;

    invoke-direct {v0}, Landroidx/media/AudioAttributesImplBase;-><init>()V

    .line 12
    iget v1, v0, Landroidx/media/AudioAttributesImplBase;->read:I

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lo/getAllPermissionGroups;->RemoteActionCompatParcelizer(II)I

    move-result v1

    iput v1, v0, Landroidx/media/AudioAttributesImplBase;->read:I

    .line 13
    iget v1, v0, Landroidx/media/AudioAttributesImplBase;->write:I

    const/4 v2, 0x2

    invoke-virtual {p0, v1, v2}, Lo/getAllPermissionGroups;->RemoteActionCompatParcelizer(II)I

    move-result v1

    iput v1, v0, Landroidx/media/AudioAttributesImplBase;->write:I

    .line 14
    iget v1, v0, Landroidx/media/AudioAttributesImplBase;->RemoteActionCompatParcelizer:I

    const/4 v2, 0x3

    invoke-virtual {p0, v1, v2}, Lo/getAllPermissionGroups;->RemoteActionCompatParcelizer(II)I

    move-result v1

    iput v1, v0, Landroidx/media/AudioAttributesImplBase;->RemoteActionCompatParcelizer:I

    .line 15
    iget v1, v0, Landroidx/media/AudioAttributesImplBase;->IconCompatParcelizer:I

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v2}, Lo/getAllPermissionGroups;->RemoteActionCompatParcelizer(II)I

    move-result p0

    iput p0, v0, Landroidx/media/AudioAttributesImplBase;->IconCompatParcelizer:I

    return-object v0
.end method

.method public static write(Landroidx/media/AudioAttributesImplBase;Lo/getAllPermissionGroups;)V
    .registers 4

    .line 22
    iget v0, p0, Landroidx/media/AudioAttributesImplBase;->read:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lo/getAllPermissionGroups;->IconCompatParcelizer(II)V

    .line 23
    iget v0, p0, Landroidx/media/AudioAttributesImplBase;->write:I

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lo/getAllPermissionGroups;->IconCompatParcelizer(II)V

    .line 24
    iget v0, p0, Landroidx/media/AudioAttributesImplBase;->RemoteActionCompatParcelizer:I

    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1}, Lo/getAllPermissionGroups;->IconCompatParcelizer(II)V

    .line 25
    iget p0, p0, Landroidx/media/AudioAttributesImplBase;->IconCompatParcelizer:I

    const/4 v0, 0x4

    invoke-virtual {p1, p0, v0}, Lo/getAllPermissionGroups;->IconCompatParcelizer(II)V

    return-void
.end method
