class FurthestBuildingSol:
    def furthestBuilding(self, heights: List[int], bricks: int, ladders: int) -> int:
        import heapq
        min_heap = []  # Priority queue (min-heap) to store height differences

        for i in range(len(heights) - 1):
            height_diff = heights[i + 1] - heights[i]

            # If no climb needed, continue
            if height_diff <= 0:
                continue

            # Use a ladder if available
            heapq.heappush(min_heap, height_diff)

            # If we've used all ladders, use bricks for smallest climbs
            if len(min_heap) > ladders:
                bricks -= heapq.heappop(min_heap)

            # If out of bricks, we can't continue
            if bricks < 0:
                return i

        # If we reach here, we traversed all buildings successfully
        return len(heights) - 1 
